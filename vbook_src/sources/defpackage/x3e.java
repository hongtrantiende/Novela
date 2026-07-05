package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x3e  reason: default package */
/* loaded from: classes.dex */
public final class x3e {
    public final String a;
    public String b;
    public final boolean c;
    public String d;
    public String e;
    public x47 f;
    public final String g;
    public final long h;
    public final long i;
    public boolean j;
    public hde k;
    public final List l;
    public f4e m;

    public x3e(String str, String str2, boolean z, String str3, String str4, x47 x47Var, String str5, long j, long j2, ArrayList arrayList, o9e o9eVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        List list = x47Var.a;
        x47 x47Var2 = new x47(1);
        if (list != null) {
            x47Var2.a.addAll(list);
        }
        this.f = x47Var2;
        this.g = str5;
        this.h = j;
        this.i = j2;
        this.j = false;
        this.k = null;
        this.l = arrayList;
        this.m = o9eVar;
    }
}
