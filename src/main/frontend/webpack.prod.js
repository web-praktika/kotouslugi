const merge = require('webpack-merge');
const common = require('./webpack.common.js');
const BundleAnalyzerPlugin = require('webpack-bundle-analyzer').BundleAnalyzerPlugin;

module.exports = merge(common, {
    mode: 'production',
    optimization: {
        splitChunks: {
            chunks: 'all',
            name: true
        },
    },
    plugins: [
        new BundleAnalyzerPlugin({ analyzerMode: 'static', openAnalyzer: false })
    ]
});