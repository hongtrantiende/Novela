package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sod  reason: default package */
/* loaded from: classes3.dex */
public abstract class sod extends xod {
    public final String b;
    public final String c;
    public final String d;

    public sod(yod yodVar, String str, String str2, String str3) {
        super(yodVar);
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public String toString() {
        return a() + " - {" + this.b + '}' + this.d + ':' + this.c + " (" + this.a + ')';
    }
}
