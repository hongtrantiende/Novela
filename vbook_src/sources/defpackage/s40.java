package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s40  reason: default package */
/* loaded from: classes.dex */
public final class s40 extends AudioDeviceCallback {
    public final /* synthetic */ koc a;

    public s40(koc kocVar) {
        this.a = kocVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.a.i();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        koc kocVar = this.a;
        if (a2d.l((AudioDeviceInfo) kocVar.j, audioDeviceInfoArr)) {
            kocVar.j = null;
        }
        kocVar.i();
    }
}
