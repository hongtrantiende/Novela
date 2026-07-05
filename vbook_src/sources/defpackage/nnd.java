package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nnd  reason: default package */
/* loaded from: classes.dex */
public final class nnd {
    public final ymd a;
    public final Context b;
    public final String c;
    public final omd d;
    public final xy1 e;
    public final bl8 f;
    public final v69 g;
    public final WorkDatabase h;
    public final bnd i;
    public final c23 j;
    public final ArrayList k;
    public final String l;
    public final y26 m;

    public nnd(qu1 qu1Var) {
        ymd ymdVar = (ymd) qu1Var.e;
        this.a = ymdVar;
        this.b = (Context) qu1Var.C;
        String str = ymdVar.a;
        this.c = str;
        this.d = (omd) qu1Var.b;
        xy1 xy1Var = (xy1) qu1Var.a;
        this.e = xy1Var;
        this.f = xy1Var.d;
        this.g = (v69) qu1Var.c;
        WorkDatabase workDatabase = (WorkDatabase) qu1Var.d;
        this.h = workDatabase;
        this.i = workDatabase.w();
        this.j = workDatabase.r();
        ArrayList arrayList = (ArrayList) qu1Var.f;
        this.k = arrayList;
        this.l = s21.q(a82.o("Work [ id=", str, ", tags={ "), sl1.i0(arrayList, ",", null, null, null, 62), " } ]");
        this.m = k27.c();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:37:0x0099
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static final java.lang.Object a(defpackage.nnd r22, defpackage.n42 r23) {
        /*
            Method dump skipped, instructions count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nnd.a(nnd, n42):java.lang.Object");
    }

    public final void b(int i) {
        bnd bndVar = this.i;
        jmd jmdVar = jmd.a;
        String str = this.c;
        bndVar.j(jmdVar, str);
        this.f.getClass();
        bndVar.i(System.currentTimeMillis(), str);
        bndVar.h(this.a.v, str);
        bndVar.g(-1L, str);
        bndVar.k(i, str);
    }

    public final void c() {
        this.f.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        bnd bndVar = this.i;
        String str = this.c;
        bndVar.i(currentTimeMillis, str);
        bndVar.j(jmd.a, str);
        fu9 fu9Var = bndVar.a;
        ((Number) gae.l(fu9Var, false, true, new a23(str, 25))).intValue();
        bndVar.h(this.a.v, str);
        gae.l(fu9Var, false, true, new a23(str, 26));
        bndVar.g(-1L, str);
    }

    public final void d(kr6 kr6Var) {
        kr6Var.getClass();
        String str = this.c;
        ArrayList C = tl1.C(str);
        while (true) {
            boolean isEmpty = C.isEmpty();
            bnd bndVar = this.i;
            if (!isEmpty) {
                String str2 = (String) xl1.R(C);
                if (bndVar.d(str2) != jmd.f) {
                    bndVar.j(jmd.d, str2);
                }
                C.addAll(this.j.a(str2));
            } else {
                tf2 tf2Var = ((hr6) kr6Var).a;
                tf2Var.getClass();
                bndVar.h(this.a.v, str);
                gae.l(bndVar.a, false, true, new t3c(24, tf2Var, str));
                return;
            }
        }
    }
}
