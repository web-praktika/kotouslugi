const path = require('path');
const CleanWebpackPlugin = require('clean-webpack-plugin');
const HtmlWebpackPlugin = require('html-webpack-plugin');
const APP_ROOT = require('app-root-path');
const buildUtilPath = APP_ROOT.resolve('public').toString();
const MiniCssExtractPlugin = require("mini-css-extract-plugin");
const webpack = require('webpack');

module.exports = {
    entry: [ './src/index.js' ],
    output: {
        path: path.resolve(__dirname, 'dist'),
        filename: "[name].js",
        chunkFilename: "[name].js"
    },
    module: {
        rules: [
            {
                test: /\.js$/,
                exclude: /node_modules/,
                use: [ "babel-loader" ]
            },
            {
                test: /\.(sa|sc|c)ss$/,
                use: [ MiniCssExtractPlugin.loader, "css-loader" ]
            },
            {
                test: /\.less$/,
                use: [ 'style-loader', 'css-loader', 'less-loader' ]
            },
            {
                test: /\.(png|jpg|ttf|eot|svg|woff|woff2|gif)$/i,
                use: 'file-loader?name=[name].[ext]'
            }
        ]
    },
    resolve: {
        extensions: [ '*', '.js', '.jsx' ]
    },
    plugins: [
        // new CleanWebpackPlugin(),
        new MiniCssExtractPlugin({
            filename: "[name].css",
            chunkFilename: "[name].css"
        }),
        new HtmlWebpackPlugin({
            title: 'Котуслуги',
            favicon: path.join(buildUtilPath, 'favicon.ico'),
            template: path.join(buildUtilPath, 'index.html'),
            appMountId: 'app'
        }),
        new webpack.ProvidePlugin({ "React": "react", }),
        new webpack.IgnorePlugin({
            resourceRegExp: /^\.\/locale$/,
            contextRegExp: /moment$/
        })
    ],
};