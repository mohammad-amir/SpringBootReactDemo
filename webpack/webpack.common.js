module.exports = {
    resolve: {
        extensions: ['.js', '.jsx'],
    },
    entry: {
        app: './src/main/ui/app.js',
        admin: './src/main/ui/admin.js'
    },
    module: {
        rules: [
            {
                test: /\.(js|jsx)$/,
                exclude: /(node_modules)/,
                use: [{
                    loader: 'babel-loader',
                    options: {
                        presets: ["@babel/preset-env", "@babel/preset-react"]
                    }
                }]
            },
            {
                test: /\.scss$/,
                loaders: [
                    {
                        loader: 'style-loader'
                    },
                    {
                        loader: 'css-loader', options: { importLoaders: 1 }
                    },
                    {
                        loader: 'sass-loader'
                    },
                ],
            },
        ]
    }
};