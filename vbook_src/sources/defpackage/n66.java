package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n66  reason: default package */
/* loaded from: classes.dex */
public final class n66 {
    public final Node a;

    public n66(Node node) {
        this.a = node;
    }

    public final String a(String str) {
        Node node = this.a;
        if (node instanceof Element) {
            Element element = (Element) node;
            if (!element.hasAttribute(str)) {
                return null;
            }
            return element.getAttribute(str);
        }
        return null;
    }

    public final ArrayList b() {
        NodeList childNodes = this.a.getChildNodes();
        ArrayList arrayList = new ArrayList(childNodes.getLength());
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            item.getClass();
            arrayList.add(new n66(item));
        }
        return arrayList;
    }

    public final List c(String str) {
        Node node = this.a;
        if (!(node instanceof Element)) {
            return ks3.a;
        }
        NodeList elementsByTagName = ((Element) node).getElementsByTagName(str);
        ArrayList arrayList = new ArrayList(elementsByTagName.getLength());
        int length = elementsByTagName.getLength();
        for (int i = 0; i < length; i++) {
            Node item = elementsByTagName.item(i);
            item.getClass();
            arrayList.add(new n66(item));
        }
        return arrayList;
    }

    public final String d() {
        Node node = this.a;
        if (node instanceof Element) {
            Element element = (Element) node;
            String localName = element.getLocalName();
            if (localName == null) {
                String tagName = element.getTagName();
                tagName.getClass();
                int f0 = k4b.f0(tagName, ':', 0, 6);
                if (f0 >= 0) {
                    return tagName.substring(f0 + 1);
                }
                return tagName;
            }
            return localName;
        }
        return null;
    }

    public final String e() {
        Node node = this.a;
        if (node instanceof Element) {
            return ((Element) node).getTagName();
        }
        return null;
    }

    public final String f() {
        String textContent = this.a.getTextContent();
        if (textContent == null) {
            return "";
        }
        return textContent;
    }
}
