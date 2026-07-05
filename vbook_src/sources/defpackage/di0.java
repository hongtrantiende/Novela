package defpackage;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: di0  reason: default package */
/* loaded from: classes.dex */
public final class di0 extends ovd {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("BasePendingResult", nk2.s(i, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i).length() + 34)), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).c(Status.D);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        if (pair.first != null) {
            vm1.h();
            return;
        }
        is9 is9Var = (is9) pair.second;
        try {
            throw null;
        } catch (RuntimeException e) {
            ro roVar = BasePendingResult.j;
            throw e;
        }
    }
}
