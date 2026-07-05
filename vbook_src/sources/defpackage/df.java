package defpackage;

import android.content.Context;
import android.os.BatteryManager;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: df  reason: default package */
/* loaded from: classes3.dex */
public final class df {
    public final Context a;
    public final BatteryManager b;

    public df(Context context) {
        this.a = context;
        this.b = (BatteryManager) context.getSystemService(BatteryManager.class);
    }
}
