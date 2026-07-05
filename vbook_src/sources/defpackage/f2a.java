package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f2a  reason: default package */
/* loaded from: classes.dex */
public final class f2a implements xg8 {
    public final int a;
    public final List b;
    public Float c = null;
    public Float d = null;
    public s1a e = null;
    public s1a f = null;

    public f2a(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // defpackage.xg8
    public final boolean T() {
        return this.b.contains(this);
    }
}
