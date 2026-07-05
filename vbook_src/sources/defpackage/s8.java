package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s8  reason: default package */
/* loaded from: classes.dex */
public final class s8 {
    public final /* synthetic */ int a;
    public final boolean b;
    public final String c;

    public s8(String str, boolean z) {
        this.a = 1;
        this.b = z;
        this.c = str;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                String str = this.c;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
                sb.append("{");
                sb.append(str);
                sb.append("}");
                sb.append(this.b);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ s8(int i, String str, boolean z) {
        this.a = i;
        this.c = str;
        this.b = z;
    }
}
