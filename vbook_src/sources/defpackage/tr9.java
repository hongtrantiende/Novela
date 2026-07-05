package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tr9  reason: default package */
/* loaded from: classes3.dex */
public final class tr9 extends RuntimeException {
    public final int a;
    public final String b;
    public final String c;

    public tr9(String str, String str2, int i) {
        super(str2);
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.c;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return s21.q(s21.r("ResponseException(errorCode=", this.a, ", data='", this.b, "', message='"), this.c, "')");
    }
}
