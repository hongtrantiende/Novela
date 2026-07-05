package defpackage;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wff  reason: default package */
/* loaded from: classes.dex */
public final class wff extends ref implements aff {
    public static final e60 C = new e60(28);
    public final Exception f;

    public wff(UUID uuid, String str, Exception exc, qgf qgfVar) {
        super("<missing root>", uuid, str, qgfVar);
        this.f = exc;
    }

    @Override // defpackage.aff
    public final yff K0(String str, jgf jgfVar, boolean z, qgf qgfVar) {
        if (z) {
            AtomicReference atomicReference = kff.a;
        }
        return new yff(str, this, jgfVar, z, qgfVar);
    }

    @Override // defpackage.sgf
    public final sgf W(String str, jgf jgfVar, qgf qgfVar) {
        AtomicReference atomicReference = kff.a;
        return K0(str, jgfVar, true, qgfVar);
    }

    @Override // defpackage.aff
    public final Exception zzf() {
        return this.f;
    }

    @Override // defpackage.sgf
    public final jgf zzh() {
        return igf.e;
    }
}
