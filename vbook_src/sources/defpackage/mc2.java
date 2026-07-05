package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mc2  reason: default package */
/* loaded from: classes.dex */
public final class mc2 {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public mc2(String str) {
        this.a = 0;
        String[] split = str.split("\\.");
        this.b = Integer.parseInt(split[0]);
        this.c = Integer.parseInt(split[1]);
        this.d = Integer.parseInt(split[2]);
        this.e = Integer.parseInt(split[3]);
    }

    public boolean a(int i) {
        if (i == 1) {
            if (this.b - this.c <= 1) {
                return false;
            }
        } else if (this.d - this.e <= 1) {
            return false;
        }
        return true;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.b);
                sb.append(".");
                sb.append(this.c);
                sb.append(".");
                sb.append(this.d);
                return nk2.s(this.e, ".", sb);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ mc2(int i, int i2, int i3, int i4, int i5) {
        this.a = i5;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }
}
