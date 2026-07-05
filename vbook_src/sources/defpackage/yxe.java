package defpackage;

import java.util.Objects;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yxe  reason: default package */
/* loaded from: classes.dex */
public final class yxe extends wze {
    public static final Set g;
    public final uxe a;
    public final txe b;
    public final wxe c;
    public final vxe d;
    public final bfe e;
    public final hlf f;

    static {
        try {
            g = (Set) new jf8(26).mo5zza();
        } catch (Exception e) {
            throw new gt1(15, e);
        }
    }

    public yxe(uxe uxeVar, txe txeVar, wxe wxeVar, bfe bfeVar, vxe vxeVar, hlf hlfVar) {
        this.a = uxeVar;
        this.b = txeVar;
        this.c = wxeVar;
        this.e = bfeVar;
        this.d = vxeVar;
        this.f = hlfVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yv] */
    public static yv b() {
        ?? obj = new Object();
        obj.a = null;
        obj.b = null;
        obj.c = null;
        obj.d = null;
        obj.e = vxe.d;
        obj.f = null;
        return obj;
    }

    @Override // defpackage.bfe
    public final boolean a() {
        if (this.d != vxe.d) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yxe)) {
            return false;
        }
        yxe yxeVar = (yxe) obj;
        if (yxeVar.a != this.a || yxeVar.b != this.b || yxeVar.c != this.c || !Objects.equals(yxeVar.e, this.e) || yxeVar.d != this.d || !Objects.equals(yxeVar.f, this.f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(yxe.class, this.a, this.b, this.c, this.e, this.d, this.f);
    }

    public final String toString() {
        return String.format("EciesParameters(curveType=%s, hashType=%s, pointFormat=%s, demParameters=%s, variant=%s, salt=%s)", this.a, this.b, this.c, this.e, this.d, this.f);
    }
}
