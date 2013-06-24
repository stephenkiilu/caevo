package timesieve.tlink;

import org.jdom.*;
import org.jdom.Namespace;

public class EventEventLink extends TLink {

  public EventEventLink(String e1, String e2, String rel) {
    super(e1,e2,rel);
  }
  public EventEventLink(String e1, String e2, TYPE rel) {
    super(e1,e2,rel);
  }
  public EventEventLink(String e1, String e2, TYPE rel, boolean closed) {
    super(e1,e2,rel,closed);
  }

  public EventEventLink(Element el) {
    super(el);
  }

  public Element toElement(Namespace ns) {
    Element el = super.toElement(ns);
    el.setAttribute(TLINK_TYPE_ATT, EVENT_EVENT);
    return el;
  }
}
