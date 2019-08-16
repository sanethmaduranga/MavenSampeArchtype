# WSO2 Integration Studio sample Maven Archetype <!-- omit in toc -->

Maven Archetype for Sample projects for WSO2 Integration Studio.


#### `branch definableESB`

Now supports generating samples as per the defined `ServiceType`. Use `-DServiceType` flag and provide `Requester or Provider` to specify the generation of samples for requester or provider.
The default value of the `ServiceType` will be used as `Requester`, if not specified the `-DServiceType` flag.


## Usage

```shell
mvn archetype:generate  -DarchetypeGroupId=sample.archetypes			\
                        -DarchetypeArtifactId=enterprice.integrator.archetype	\
                        -DarchetypeVersion=2.0-SNAPSHOT				\
                        -DgroupId=<Group ID>					\
                        -DartifactId=<Artifact ID>				\
                        -Dname=<Name>						\
			-Ddescription=<Description>				\
			-DServiceType=<Requester || Provider>
```


#### `branch ESBproject`

This branch can be used to generete a sample project including the both `Requester and Provider` examples.

## Usage

```shell
mvn archetype:generate  -DarchetypeGroupId=sample.archetypes			\
                        -DarchetypeArtifactId=enterprice.integrator.archetype	\
                        -DarchetypeVersion=1.0-SNAPSHOT				\
                        -DgroupId=<Group ID>		                        \
                        -DartifactId=<Artifact ID>      		        \
                        -Dname=<Name>				    		\
			-Ddescription=<Description>
```


