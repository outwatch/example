const {webDev} = require("@fun-stack/fun-pack");

module.exports = webDev({
  indexHtml: "src/main/html/index.html",
  assetsDir: "assets",
  extraWatchDirs: [
    "local" // frontend with local backend
    // "../terraform/.terraform/modules/uglot/serve/" // frontend with deployed backend
  ]
});
