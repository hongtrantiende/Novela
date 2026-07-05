package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: du9  reason: default package */
/* loaded from: classes.dex */
public final class du9 {
    public final Context b;
    public final String c;
    public Executor f;
    public Executor g;
    public d89 h;
    public boolean i;
    public boolean q;
    public boolean r;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final eu9 j = eu9.a;
    public final long k = -1;
    public final r18 l = new r18(1);
    public final LinkedHashSet m = new LinkedHashSet();
    public final LinkedHashSet n = new LinkedHashSet();
    public final ArrayList o = new ArrayList();
    public boolean p = true;
    public final boolean s = true;
    public final gi1 a = cm9.a(WorkDatabase.class);

    public du9(Context context, String str) {
        this.b = context;
        this.c = str;
    }

    public final void a(jc7... jc7VarArr) {
        for (jc7 jc7Var : jc7VarArr) {
            Integer valueOf = Integer.valueOf(jc7Var.a);
            LinkedHashSet linkedHashSet = this.n;
            linkedHashSet.add(valueOf);
            linkedHashSet.add(Integer.valueOf(jc7Var.b));
        }
        jc7[] jc7VarArr2 = (jc7[]) Arrays.copyOf(jc7VarArr, jc7VarArr.length);
        r18 r18Var = this.l;
        r18Var.getClass();
        for (jc7 jc7Var2 : jc7VarArr2) {
            r18Var.a(jc7Var2);
        }
    }
}
