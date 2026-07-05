package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzl {
    private final List zza;
    private zzek zzb;

    public /* synthetic */ zzl(List list, int i, ct2 ct2Var) {
        this.zza = new ArrayList();
        zze[] zzeVarArr = (zze[]) ks3.a.toArray(new zze[0]);
        zzh((zze[]) Arrays.copyOf(zzeVarArr, zzeVarArr.length));
    }

    private final void zzh(zze... zzeVarArr) {
        List list = this.zza;
        list.getClass();
        zzeVarArr.getClass();
        List asList = Arrays.asList(zzeVarArr);
        asList.getClass();
        list.addAll(asList);
    }

    public final Object zzb(String str, long j, m42 m42Var) {
        return k27.p(new zzh(this, str, j, null), m42Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzc(long r11, com.google.android.recaptcha.internal.zzsc r13, com.google.android.recaptcha.internal.zzek r14, defpackage.m42 r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof com.google.android.recaptcha.internal.zzi
            if (r0 == 0) goto L13
            r0 = r15
            com.google.android.recaptcha.internal.zzi r0 = (com.google.android.recaptcha.internal.zzi) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzi r0 = new com.google.android.recaptcha.internal.zzi
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r15 = r0.zza
            int r1 = r0.zzc
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r15)
            goto L44
        L25:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r10)
            r10 = 0
            return r10
        L2c:
            defpackage.hre.r(r15)
            com.google.android.recaptcha.internal.zzk r3 = new com.google.android.recaptcha.internal.zzk
            r9 = 0
            r4 = r10
            r6 = r11
            r8 = r13
            r5 = r14
            r3.<init>(r4, r5, r6, r8, r9)
            r0.zzc = r2
            java.lang.Object r15 = defpackage.k27.p(r3, r0)
            n82 r10 = defpackage.n82.a
            if (r15 != r10) goto L44
            return r10
        L44:
            hs9 r15 = (defpackage.hs9) r15
            java.lang.Object r10 = r15.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzl.zzc(long, com.google.android.recaptcha.internal.zzsc, com.google.android.recaptcha.internal.zzek, m42):java.lang.Object");
    }

    public final List zzd() {
        return this.zza;
    }

    public final void zzf(zze... zzeVarArr) {
        zzh((zze[]) Arrays.copyOf(zzeVarArr, 1));
    }

    public final void zzg(zzsr zzsrVar) {
        for (zze zzeVar : this.zza) {
            zzeVar.zzk(zzsrVar);
        }
    }

    public zzl() {
        this(null, 1, null);
    }
}
