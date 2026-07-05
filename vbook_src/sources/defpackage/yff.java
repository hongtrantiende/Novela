package defpackage;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yff  reason: default package */
/* loaded from: classes.dex */
public final class yff extends cff implements aff {
    public final Exception C;
    public final boolean D;

    public yff(String str, aff affVar, jgf jgfVar, boolean z, qgf qgfVar) {
        super("<missing root>:".concat(str), (ref) affVar, jgf.a(jgfVar, igf.f), qgfVar);
        this.C = affVar.zzf();
        this.D = z;
    }

    @Override // defpackage.aff
    public final yff K0(String str, jgf jgfVar, boolean z, qgf qgfVar) {
        boolean z2 = this.D;
        if (z && !z2) {
            AtomicReference atomicReference = kff.a;
        }
        boolean z3 = true;
        if ((!z || z2) && !z2) {
            z3 = false;
        }
        return new yff(str, this, jgfVar, z3, qgfVar);
    }

    @Override // defpackage.sgf
    public final sgf W(String str, jgf jgfVar, qgf qgfVar) {
        AtomicReference atomicReference = kff.a;
        return K0(str, jgfVar, true, qgfVar);
    }

    @Override // defpackage.aff
    public final Exception zzf() {
        return this.C;
    }

    @Override // defpackage.sgf
    public final jgf zzl() {
        return igf.e;
    }

    public yff(UUID uuid, String str, String str2, jgf jgfVar, Exception exc, qgf qgfVar) {
        super("<missing root>:".concat(str2), uuid, str, jgf.a(jgfVar, igf.f), qgfVar);
        this.C = exc;
        this.D = false;
    }
}
