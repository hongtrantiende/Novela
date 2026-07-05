package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzii implements zzih {
    private final Context zza;
    private final Map zzb = o17.s(new yk8(2, Context.ACTIVITY_SERVICE), new yk8(3, Context.TELEPHONY_SERVICE), new yk8(4, Context.INPUT_METHOD_SERVICE), new yk8(5, Context.AUDIO_SERVICE));

    public zzii(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzie.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final Object zza(Object... objArr) {
        Object obj = objArr[0];
        if (true != (obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            Object obj2 = this.zzb.get(Integer.valueOf(num.intValue()));
            if (obj2 != null) {
                return this.zza.getSystemService((String) obj2);
            }
            throw new zzce(4, 4, null);
        }
        hfd.f(4, 5, null);
        return null;
    }
}
