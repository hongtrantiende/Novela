package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: at9  reason: default package */
/* loaded from: classes3.dex */
public final class at9 {
    public static final at9 b = new at9(tl1.B(new qfc(hva.a, "Bold"), new qfc(ova.a, "Italic"), new qfc(rva.a, "Underline"), new qfc(qva.a, "Strikethrough"), new qfc(lva.a, "Inline Code"), new qfc(new jva(4294961979L), "Highlight")));
    public final List a;

    public at9(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof at9) && this.a.equals(((at9) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + eub.k(this.a.hashCode() * 31, 31, true);
    }

    public final String toString() {
        return "RichTextToolbarConfig(buttons=" + this.a + ", showIndentation=true, showLink=true)";
    }
}
