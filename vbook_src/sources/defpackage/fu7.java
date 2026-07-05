package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fu7  reason: default package */
/* loaded from: classes.dex */
public final class fu7 implements c9b, Serializable {
    public final int a;

    public fu7() {
        kue.e(2, "expectedValuesPerKey");
        this.a = 2;
    }

    @Override // defpackage.c9b
    public final Object get() {
        return new ArrayList(this.a);
    }
}
