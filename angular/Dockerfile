# Imagen base con Node.js (Angular 19 requiere Node >= 18)
FROM node:20-alpine

# Instalar dependencias necesarias
RUN apk add --no-cache nginx bash

# Crear directorio de trabajo
WORKDIR /usr/src/app

# Instalar Angular CLI globalmente
RUN npm install -g @angular/cli@19

# Configurar Nginx (crea carpeta de runtime)
RUN mkdir -p /run/nginx
COPY nginx.conf /etc/nginx/conf.d/default.conf

# Exponer puertos

# Para desarrollo (ng serve)
EXPOSE 4200

# Para servir con Nginx
EXPOSE 80

# Comando por defecto
CMD ["bash"]
