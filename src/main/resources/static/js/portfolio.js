document
  .getElementById("search-form")
  .addEventListener("submit", function (event) {
    event.preventDefault(); // フォームのデフォルトの送信を防ぐ

    const keyword = document.getElementById("search-box").value;
    const resultsDiv = document.getElementById("item-area");

    // 検索結果の表示領域をクリア
    resultsDiv.innerHTML = "";

    fetch(`/api/search?query=${encodeURIComponent(keyword)}`)
      .then((response) => response.json())
      .then((data) => {
        displayResults(data, resultsDiv);
      })
      .catch((error) => {
        console.error("Error:", error);
        resultsDiv.textContent = "検索結果を取得できませんでした。";
      });
  });

function displayResults(data, container) {
  container.innerHTML = ""; // コンテナをクリア
  if (data.length === 0) {
    container.textContent = "該当する結果はありません。";
    return;
  }
  data.forEach((item) => {
    const itemElement = document.createElement("div");
    itemElement.textContent = `Item: ${item.name}`;
    container.appendChild(itemElement);
  });
}
