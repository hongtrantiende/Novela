package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qfc  reason: default package */
/* loaded from: classes3.dex */
public final class qfc {
    public final tva a;
    public final String b;

    public qfc(tva tvaVar, String str) {
        this.a = tvaVar;
        this.b = str;
        if (!(tvaVar instanceof pva)) {
            return;
        }
        vs.m("SpanStyle.Link cannot be used with ToolbarButtonSpec; use RichTextToolbarConfig.showLink instead.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qfc) {
                qfc qfcVar = (qfc) obj;
                if (!this.a.equals(qfcVar.a) || !this.b.equals(qfcVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ToolbarButtonSpec(style=" + this.a + ", label=" + this.b + ")";
    }
}
