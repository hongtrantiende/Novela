package com.google.android.recaptcha.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzbh extends aab implements lu4 {
    public zzbh(m42 m42Var) {
        super(2, m42Var);
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new zzbh(m42Var);
    }

    @Override // defpackage.lu4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbh) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        hre.r(obj);
        Thread.currentThread().setPriority(8);
        return pvc.a;
    }
}
