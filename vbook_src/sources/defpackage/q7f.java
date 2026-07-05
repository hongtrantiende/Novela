package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.AbstractCollection;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q7f  reason: default package */
/* loaded from: classes.dex */
public final class q7f {
    public static Boolean d;
    public final a0f a;
    public final Uri b;
    public final String c;

    public q7f(a0f a0fVar, String str) {
        this.a = a0fVar;
        this.c = str;
        Context context = a0fVar.b;
        Pattern pattern = p9f.a;
        yv yvVar = new yv(context);
        yvVar.O("phenotype");
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4);
        sb.append("/");
        sb.append(str);
        sb.append(".pb");
        yvVar.R(sb.toString());
        this.b = yvVar.S();
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.vz0 a() {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q7f.a():vz0");
    }

    public final boolean b() {
        t2f c = this.a.g.c();
        if (c.v() && ((AbstractCollection) c.A()).contains(czd.FILE)) {
            return true;
        }
        return false;
    }
}
