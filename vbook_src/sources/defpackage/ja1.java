package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ja1  reason: default package */
/* loaded from: classes.dex */
public final class ja1 implements x7b, v26 {
    public final List a;

    public /* synthetic */ ja1(List list) {
        this.a = list;
    }

    @Override // defpackage.x7b
    public int a(long j) {
        if (j < 0) {
            return 0;
        }
        return -1;
    }

    @Override // defpackage.x7b
    public long c(int i) {
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        return 0L;
    }

    @Override // defpackage.x7b
    public List f(long j) {
        if (j >= 0) {
            return this.a;
        }
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.x7b
    public int g() {
        return 1;
    }

    @Override // defpackage.v26
    public Object h(String str, Object[] objArr) {
        objArr.getClass();
        return z87.C(gs3.a, new z45(this.a, str, objArr, (m42) null));
    }
}
