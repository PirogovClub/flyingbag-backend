package tech.flyingbag.magnet.services;

import tech.flyingbag.magnet.domain.MagnetMessage;

public interface MagnetMessageService {

    MagnetMessage getMagnetMessageFromProvider(MagnetMessage magnetMessage);
}
