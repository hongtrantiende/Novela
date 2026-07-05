package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vb0  reason: default package */
/* loaded from: classes.dex */
public final class vb0 {
    public String a;
    public int b;
    public int c;
    public boolean d;
    public byte e;

    public final wb0 a() {
        String str;
        if (this.e == 7 && (str = this.a) != null) {
            return new wb0(this.b, this.c, str, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" processName");
        }
        if ((this.e & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.e & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.e & 4) == 0) {
            sb.append(" defaultProcess");
        }
        vs.k(s21.o("Missing required properties:", sb));
        return null;
    }
}
