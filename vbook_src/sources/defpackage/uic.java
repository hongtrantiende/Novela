package defpackage;

import android.os.Trace;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uic  reason: default package */
/* loaded from: classes.dex */
public final class uic {
    public static final uic a = new Object();

    public final void a(String str, int i) {
        Trace.beginAsyncSection(str, i);
    }

    public final void b(String str, int i) {
        Trace.endAsyncSection(str, i);
    }
}
