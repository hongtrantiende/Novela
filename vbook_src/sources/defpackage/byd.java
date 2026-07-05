package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: byd  reason: default package */
/* loaded from: classes.dex */
public final class byd extends c41 {
    public static final Set g;
    public static final dlf h;
    public static final zxd i;
    public final String c;
    public final Level d;
    public final Set e;
    public final dlf f;

    static {
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(ajf.a, lkf.b, mkf.a)));
        g = unmodifiableSet;
        dlf dlfVar = new dlf(pae.s(unmodifiableSet));
        h = dlfVar;
        i = new zxd(Level.ALL, unmodifiableSet, dlfVar);
    }

    public /* synthetic */ byd(String str, Level level, Set set, dlf dlfVar) {
        super(str, 4);
        this.c = q0f.s(str);
        this.d = level;
        this.e = set;
        this.f = dlfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x02b1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(defpackage.pif r31, java.lang.String r32, java.util.logging.Level r33, java.util.Set r34, defpackage.dlf r35) {
        /*
            Method dump skipped, instructions count: 1193
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byd.j(pif, java.lang.String, java.util.logging.Level, java.util.Set, dlf):void");
    }

    @Override // defpackage.c41
    public final boolean g(Level level) {
        int t = q0f.t(level);
        if (!Log.isLoggable(this.c, t) && !Log.isLoggable("all", t)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.c41
    public final void h(pif pifVar) {
        j(pifVar, this.c, this.d, this.e, this.f);
    }
}
