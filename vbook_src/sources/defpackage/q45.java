package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q45  reason: default package */
/* loaded from: classes3.dex */
public final class q45 {
    public ArrayList a;

    public final int a(int i) {
        return ((int[]) this.a.get(i / 768))[i % 768];
    }

    public final void b(int i, int i2) {
        ((int[]) this.a.get(i / 768))[i % 768] = i2;
    }
}
