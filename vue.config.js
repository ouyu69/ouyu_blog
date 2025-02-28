const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  devServer: {
    port: 8081, // 设置端口为8081
    proxy: {
      '/api': {
        target: 'http://localhost:8083',
        changeOrigin: true,
        pathRewrite: {
          '^/api': ''
        }
      }
    },
  }
})
