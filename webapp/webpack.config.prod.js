const {webProd} = require("@fun-stack/fun-pack");
const {merge} = require("webpack-merge");

// https://github.com/fun-stack/fun-pack
prodConfig = webProd({
  indexHtml: "src/main/html/index.html",
  // assetsDir: "assets",
});

myConfig = {
  ignoreWarnings: [/./]
}

module.exports = merge(
  prodConfig, myConfig
)

