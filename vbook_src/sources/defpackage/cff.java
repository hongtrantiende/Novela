package defpackage;

import java.util.UUID;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cff  reason: default package */
/* loaded from: classes.dex */
public abstract class cff extends ref {
    public final jgf f;

    public cff(String str, ref refVar, jgf jgfVar, qgf qgfVar) {
        super(str, refVar, qgfVar);
        wq9.s(jgfVar.c);
        this.f = jgfVar;
    }

    @Override // defpackage.sgf
    public final jgf zzh() {
        return jgf.a(this.f, zzl());
    }

    public cff(String str, UUID uuid, String str2, jgf jgfVar, qgf qgfVar) {
        super(str, uuid, str2, qgfVar);
        wq9.s(jgfVar.c);
        this.f = jgfVar;
    }
}
