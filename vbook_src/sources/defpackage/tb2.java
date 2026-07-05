package defpackage;

import android.os.Bundle;
import android.os.ResultReceiver;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tb2  reason: default package */
/* loaded from: classes.dex */
public final class tb2 {
    public static px4 a(String str, String str2) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1567968963) {
                if (hashCode != -154594663) {
                    if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                        return new ox4(str2, 5);
                    }
                } else if (str.equals("GET_INTERRUPTED")) {
                    return new ox4(str2, 1);
                }
            } else if (str.equals("GET_CANCELED_TAG")) {
                return new nx4(str2);
            }
        }
        return new ox4(str2, 3);
    }

    public static void b(ResultReceiver resultReceiver, String str, String str2) {
        resultReceiver.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", str2);
        resultReceiver.send(Integer.MAX_VALUE, bundle);
    }
}
