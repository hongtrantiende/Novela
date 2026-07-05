package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sp9  reason: default package */
/* loaded from: classes.dex */
public final class sp9 extends tp9 {
    public final zg9 D;
    public final k57 E;

    public sp9(vq4 vq4Var, qs5 qs5Var, k5a k5aVar, ArrayList arrayList, List list, List list2) {
        super(vq4Var, qs5Var, k5aVar, arrayList, list, list2);
        zg9 zg9Var;
        Uri.parse(((mi0) qs5Var.get(0)).a);
        long j = k5aVar.e;
        if (j <= 0) {
            zg9Var = null;
        } else {
            zg9Var = new zg9(k5aVar.d, j, null);
        }
        this.D = zg9Var;
        this.E = zg9Var == null ? new k57(new zg9(0L, -1L, null), 9) : null;
    }

    @Override // defpackage.tp9
    public final String a() {
        return null;
    }

    @Override // defpackage.tp9
    public final pf2 d() {
        return this.E;
    }

    @Override // defpackage.tp9
    public final zg9 e() {
        return this.D;
    }
}
