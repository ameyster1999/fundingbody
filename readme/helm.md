# FundingBody

- A rest api deployment using helm charts for an entity funding body

## Installation:
- To  install helm in windows :
```
choco install helm 
```
- to install helm in linux or mac:
 ```` 
 brew install helm
  ````

## Usage
 
deploy application container to Ecs or Ec2

# Helm

## Prerequisites
- Before you can use Helm to deploy the application, you'll need to have the following installed:

   - Kubernetes cluster
   - Helm v3 or later
# Configuration
Before deploying the application, you'll need to configure the Helm chart.

1. Open the values.yaml file in the helm directory.
2. Update any necessary configuration values.
3. Save the file.
# Deploying with Helm
To deploy the application using Helm, run the following command:

```
helm install funding-body-relase  ./helm
```
# Upgrading with Helm
If you need to upgrade the application, you can do so using Helm.

To upgrade the application using Helm, run the following command:

````
helm upgrade funding-body-relase ./helm
````
Uninstalling with Helm
If you need to uninstall the application, you can do so using Helm.

To uninstall the application using Helm, run the following command:

````
helm uninstall funding-body-relase
````
