package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import com.google.ads.interactivemedia.v3.impl.data.NetworkResponseData;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a4f  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class a4f implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a4f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ComponentName componentName = null;
        switch (this.a) {
            case 0:
                int i = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 30);
                    sb.append("Received response to request: ");
                    sb.append(i);
                    Log.d("MessengerIpcClient", sb.toString());
                }
                r5f r5fVar = (r5f) this.b;
                synchronized (r5fVar) {
                    try {
                        SparseArray sparseArray = r5fVar.e;
                        e8f e8fVar = (e8f) sparseArray.get(i);
                        if (e8fVar == null) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 39);
                            sb2.append("Received response for unknown request: ");
                            sb2.append(i);
                            Log.w("MessengerIpcClient", sb2.toString());
                        } else {
                            sparseArray.remove(i);
                            r5fVar.d();
                            Bundle data = message.getData();
                            if (data.getBoolean("unsupported", false)) {
                                e8fVar.c(new e60(27, "Not supported by GmsCore", (Throwable) null));
                            } else {
                                switch (e8fVar.e) {
                                    case 0:
                                        if (data.getBoolean("ack", false)) {
                                            e8fVar.b(null);
                                            break;
                                        } else {
                                            e8fVar.c(new e60(27, "Invalid response to one way request", (Throwable) null));
                                            break;
                                        }
                                    default:
                                        Bundle bundle = data.getBundle("data");
                                        if (bundle == null) {
                                            bundle = Bundle.EMPTY;
                                        }
                                        e8fVar.b(bundle);
                                        break;
                                }
                            }
                        }
                    } finally {
                    }
                }
                return true;
            default:
                int i2 = message.what;
                if (i2 != 0) {
                    if (i2 != 1) {
                        return false;
                    }
                    w6f w6fVar = (w6f) this.b;
                    synchronized (w6fVar.a) {
                        try {
                            j2f j2fVar = (j2f) message.obj;
                            y3f y3fVar = (y3f) w6fVar.a.get(j2fVar);
                            if (y3fVar != null && y3fVar.b == 3) {
                                String valueOf = String.valueOf(j2fVar);
                                StringBuilder sb3 = new StringBuilder(valueOf.length() + 47);
                                sb3.append("Timeout waiting for ServiceConnection callback ");
                                sb3.append(valueOf);
                                Log.e("GmsClientSupervisor", sb3.toString(), new Exception());
                                ComponentName componentName2 = y3fVar.f;
                                if (componentName2 == null) {
                                    j2fVar.getClass();
                                } else {
                                    componentName = componentName2;
                                }
                                if (componentName == null) {
                                    String str = j2fVar.b;
                                    am8.s(str);
                                    componentName = new ComponentName(str, NetworkResponseData.UNKNOWN_CONTENT_TYPE);
                                }
                                y3fVar.onServiceDisconnected(componentName);
                            }
                        } finally {
                        }
                    }
                    return true;
                }
                w6f w6fVar2 = (w6f) this.b;
                synchronized (w6fVar2.a) {
                    try {
                        j2f j2fVar2 = (j2f) message.obj;
                        y3f y3fVar2 = (y3f) w6fVar2.a.get(j2fVar2);
                        if (y3fVar2 != null && y3fVar2.a.isEmpty()) {
                            if (y3fVar2.c) {
                                j2f j2fVar3 = y3fVar2.e;
                                w6f w6fVar3 = y3fVar2.C;
                                w6fVar3.c.removeMessages(1, j2fVar3);
                                w6fVar3.d.c(w6fVar3.b, y3fVar2);
                                y3fVar2.c = false;
                                y3fVar2.b = 2;
                            }
                            w6fVar2.a.remove(j2fVar2);
                        }
                    } finally {
                    }
                }
                return true;
        }
    }
}
