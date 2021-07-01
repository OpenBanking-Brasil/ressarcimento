# coding: utf-8

"""
    Plataforma de Ressarcimento do Open Banking Brasil

    APIs da plataforma de Ressarcimento do Open Banking Brasil para a comunicação online com a plaforma. Através da documentação das APIs abaixo é possível realizar os devidos testes de integração.  # noqa: E501

    OpenAPI spec version: beta-0.0.1
    Contact: suporte-ressarcimento@openbankingbrasil.org.br
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six

class RefundProcess(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'process_id': 'str',
        'status': 'str'
    }

    attribute_map = {
        'process_id': 'processId',
        'status': 'status'
    }

    def __init__(self, process_id=None, status=None):  # noqa: E501
        """RefundProcess - a model defined in Swagger"""  # noqa: E501
        self._process_id = None
        self._status = None
        self.discriminator = None
        if process_id is not None:
            self.process_id = process_id
        if status is not None:
            self.status = status

    @property
    def process_id(self):
        """Gets the process_id of this RefundProcess.  # noqa: E501


        :return: The process_id of this RefundProcess.  # noqa: E501
        :rtype: str
        """
        return self._process_id

    @process_id.setter
    def process_id(self, process_id):
        """Sets the process_id of this RefundProcess.


        :param process_id: The process_id of this RefundProcess.  # noqa: E501
        :type: str
        """

        self._process_id = process_id

    @property
    def status(self):
        """Gets the status of this RefundProcess.  # noqa: E501


        :return: The status of this RefundProcess.  # noqa: E501
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this RefundProcess.


        :param status: The status of this RefundProcess.  # noqa: E501
        :type: str
        """
        allowed_values = ["PENDING", "IN_PROGRESS", "PROCCESSED"]  # noqa: E501
        if status not in allowed_values:
            raise ValueError(
                "Invalid value for `status` ({0}), must be one of {1}"  # noqa: E501
                .format(status, allowed_values)
            )

        self._status = status

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(RefundProcess, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, RefundProcess):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
