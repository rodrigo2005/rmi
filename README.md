# rmi

RMI (Remote Method Invocation)
- Is a Java application programming interface that performs the object-oriented equivalent of remote procedure calls (RPC).
- Depends on Java Virtual Machine (JVM) class representation mechanisms and it thus only supports making calls from one JVM to another.
- The protocol underlying this Java-only implementation is known as Java Remote Method Protocol (JRMP).
- Use stubs e and skeletons to comunication.

RMI-IIOP
- denotes the Java Remote Method Invocation (RMI) interface over the Internet 
Inter-Orb Protocol (IIOP), which delivers Common Object Request Broker
Architecture (CORBA) distributed computing capabilities to the Java 2 platform. It is 20
based on two specifications: the Java Language Mapping to OMG IDL, and CORBA/IIOP 2.3.1
- in order to support code running in a non-JVM context, a CORBA version was later
developed. JRMP, whereas the term RMI-IIOP (read: RMI over IIOP) denotes the RMI interface delegating most of the functionality to the supporting CORBA implementation.
- is the protocol used with EJB.
- not support Stub downloads and distributed garbage collection.
