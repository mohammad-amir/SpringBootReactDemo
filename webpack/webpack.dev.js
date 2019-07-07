const merge = require('webpack-merge');
const common = require('./webpack.common');
const webpack = require('webpack');
const CleanWebpackPlugin = require('clean-webpack-plugin');

module.exports = merge(common, {
    mode: 'development',
    devtool: 'cheap-module-eval-source-map',
    output: {
        filename: '[name].bundle.js',
        publicPath: 'http://localhost:3000/',
    },
    devServer: {
        inline: true,
        filename: '[name].bundle.js',
        port: 3000,
        headers: {"Access-Control-Allow-Origin": "*"},
        disableHostCheck: true,
        stats: {
            colors: true
        }
    },
    plugins: [
        new CleanWebpackPlugin(),
        new webpack.NamedModulesPlugin()
    ]
});