import org.ros.namespace.GraphName;
import org.ros.node.Node;
import org.ros.node.NodeMain;
import org.ros.node.ConnectedNode;

public class MyNode implements NodeMain {

  @Override
  public GraphName getDefaultNodeName() {
    return  GraphName.of("my_node");
  }

  @Override
  public void onStart(ConnectedNode node) {
  }

  @Override
  public void onShutdown(Node node) {
  }

  @Override
  public void onShutdownComplete(Node node) {
  }

  @Override
  public void onError(Node node, Throwable throwable) {
  }
}
