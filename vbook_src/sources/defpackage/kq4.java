package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kq4  reason: default package */
/* loaded from: classes.dex */
public final class kq4 implements Comparable {
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    public kq4(String str, int i, int i2, String str2) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        kq4 kq4Var = (kq4) obj;
        kq4Var.getClass();
        int i = this.a - kq4Var.a;
        if (i == 0) {
            return this.b - kq4Var.b;
        }
        return i;
    }
}
