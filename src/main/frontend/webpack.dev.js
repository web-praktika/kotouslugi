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
        port: 3001,
        stats: "minimal",
        hot: true,
        proxy: [
            {
                context: [ "/api" ],
                target: "http://localhost:8080"
            },
            {
                context: [ "/" ],
                target: 'http://localhost:3001',
                bypass: function (req, res) {
                    if (req.headers.accept.indexOf('html') !== -1) {
                        return '/index.html';
                    }else{
                        return res
                    }
                }
            }
        ]
    }
});