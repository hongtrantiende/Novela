package defpackage;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xze  reason: default package */
/* loaded from: classes.dex */
public final class xze {
    public static fjf j;
    public static final c0e k;
    public final String a;
    public final String b;
    public final mze c;
    public final uga d;
    public final Task e;
    public final Task f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        k = new c0e(objArr);
    }

    public xze(Context context, uga ugaVar, mze mzeVar, String str) {
        int i;
        new HashMap();
        this.a = context.getPackageName();
        this.b = vq1.a(context);
        this.d = ugaVar;
        this.c = mzeVar;
        r0f.F();
        this.g = str;
        fz4 E = fz4.E();
        iq7 iq7Var = new iq7(this, 3);
        E.getClass();
        this.e = fz4.o0(iq7Var);
        fz4 E2 = fz4.E();
        ugaVar.getClass();
        rze rzeVar = new rze(ugaVar, 0);
        E2.getClass();
        this.f = fz4.o0(rzeVar);
        c0e c0eVar = k;
        if (c0eVar.containsKey(str)) {
            i = zm3.d(context, (String) c0eVar.get(str), false);
        } else {
            i = -1;
        }
        this.h = i;
    }
}
