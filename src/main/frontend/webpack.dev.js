const merge = require('webpack-merge');
const common = require('./webpack.common.js');

module.exports = merge(common, {
    mode: 'development',
    devtool: 'inline-source-map',
    output: {
        publicPath: '/',
        filename: "index.js"
    },
    devServer: {
        compress: true,
        port: 3000,
        stats: "minimal",
        hot: true,
        proxy: [
            {
                context: [ "/api" ],
                target: "http://localhost:8080"
            }
        ]
    }
});