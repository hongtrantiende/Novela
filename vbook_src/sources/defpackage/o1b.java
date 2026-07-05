package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o1b  reason: default package */
/* loaded from: classes3.dex */
public abstract class o1b {
    public static final Set a = b00.F0(new o9a[]{rtc.b, wtc.b, mtc.b, euc.b});

    public static final boolean a(o9a o9aVar) {
        o9aVar.getClass();
        if (o9aVar.isInline() && a.contains(o9aVar)) {
            return true;
        }
        return false;
    }
}
