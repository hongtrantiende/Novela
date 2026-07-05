package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bie  reason: default package */
/* loaded from: classes.dex */
public final class bie extends jhe {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final yhe e;
    public final zhe f;

    public bie(int i, int i2, int i3, int i4, yhe yheVar, zhe zheVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = yheVar;
        this.f = zheVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yv] */
    public static yv b() {
        ?? obj = new Object();
        obj.a = null;
        obj.b = null;
        obj.c = null;
        obj.d = null;
        obj.e = null;
        obj.f = yhe.e;
        return obj;
    }

    @Override // defpackage.bfe
    public final boolean a() {
        if (this.e != yhe.e) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bie)) {
            return false;
        }
        bie bieVar = (bie) obj;
        if (bieVar.a != this.a || bieVar.b != this.b || bieVar.c != this.c || bieVar.d != this.d || bieVar.e != this.e || bieVar.f != this.f) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(bie.class, Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f);
    }

    public final String toString() {
        StringBuilder y = nk2.y("AesCtrHmacAead Parameters (variant: ", String.valueOf(this.e), ", hashType: ", String.valueOf(this.f), ", ");
        rs8.q(this.c, this.d, "-byte IV, and ", "-byte tags, and ", y);
        return hl5.j(this.a, this.b, "-byte AES key, and ", "-byte HMAC key)", y);
    }
}
