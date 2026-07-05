package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ovd  reason: default package */
/* loaded from: classes.dex */
public class ovd extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovd(Looper looper, int i) {
        super(looper);
        switch (i) {
            case 2:
                super(looper);
                Looper.getMainLooper();
                return;
            case 3:
            default:
                Looper.getMainLooper();
                return;
            case 4:
                super(looper);
                Looper.getMainLooper();
                return;
        }
    }
}
