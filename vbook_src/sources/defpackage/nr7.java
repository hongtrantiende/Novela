package defpackage;

import android.view.MotionEvent;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nr7  reason: default package */
/* loaded from: classes.dex */
public final class nr7 {
    public static final nr7 a = new Object();

    public final boolean a(MotionEvent motionEvent, int i) {
        if ((Float.floatToRawIntBits(motionEvent.getRawX(i)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i)) & Integer.MAX_VALUE) < 2139095040) {
            return true;
        }
        return false;
    }
}
